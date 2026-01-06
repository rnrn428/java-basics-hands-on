package com.nhn.academy.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nhn.academy.todo.model.Priority;
import com.nhn.academy.todo.model.Category;
import com.nhn.academy.todo.model.Todo;
import com.nhn.academy.todo.service.TodoService;

public class Main {

    private static final String FILENAME = "todos.csv";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TodoService service = new TodoService();

        service.loadFromFile(FILENAME);

        while (true) {
            System.out.println("=== TODO 앱 ===");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
            String input = reader.readLine();
            input = input.trim();

            switch (input) {
                case "1":
                    System.out.println("=== TODO 등록 ===");

                    System.out.print("제목 > ");
                    String title = reader.readLine();

                    if (service.isDuplicate(title)) {
                        System.out.println("동일한 제목의 일정이 이미 존재합니다.");
                        System.out.println();
                        break;
                    }

                    System.out.print("예상 시간 > ");
                    int hours = Integer.parseInt(reader.readLine());

                    System.out.print("구분 (1:WORK, 2:STUDY, 3:PERSONAL, 4:HEALTH, 5:OTHER) > ");
                    int ca = Integer.parseInt(reader.readLine());
                    Category cat = Category.fromNumber(ca);

                    System.out.print("중요도 (1: LOW, 2: MEDIUM, 3:HIGH) > ");
                    int level = Integer.parseInt(reader.readLine());
                    Priority p = Priority.fromLevel(level);
                    try {
                        service.add(new Todo(title, hours, cat, p, false));

                        System.out.println("등록 완료!");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;

                case "2":
                    System.out.println();
                    System.out.println("=== 조회 메뉴 ===");
                    System.out.println("1. 전체 조회");
                    System.out.println("2. 구분별 조회");
                    System.out.println("3. 중요도별 조회");
                    System.out.println("0. 이전");
                    System.out.print("선택 > ");
                    int select2 = Integer.parseInt(reader.readLine());

                    switch (select2) {
                        case 1:
                            service.printAll();
                            break;
                        case 2:
                            System.out.print("구분 (1:WORK, 2:STUDY, 3:PERSONAL, 4:HEALTH, 5:OTHER) > ");
                            int cNum = Integer.parseInt(reader.readLine());
                            service.printCat(Category.fromNumber(cNum));
                            break;
                        case 3:
                            System.out.print("중요도 (1: LOW, 2: MEDIUM, 3:HIGH) > ");
                            int pLev = Integer.parseInt(reader.readLine());
                            service.printPr(Priority.fromLevel(pLev));
                            break;
                        case 0:
                            break;

                    }
                    System.out.println();
                    break;
                case "3":
                    System.out.println();
                    try {
                        System.out.print("수정할 TODO ID > ");
                        int id = Integer.parseInt(reader.readLine());

                        System.out.print("새 제목 > ");
                        String newTitle = reader.readLine();

                        System.out.print("새 예상 시간 > ");
                        int prhour = Integer.parseInt(reader.readLine());

                        int targetIndex = id - 1;

                        service.update(targetIndex, newTitle, prhour);

                        System.out.println("수정 완료 !");
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println("수정 실패: " + e.getMessage());
                    }

                    break;

                case "4":
                    System.out.println();
                    try {
                        System.out.print("삭제할 TODO ID > ");
                        int id2 = Integer.parseInt(reader.readLine());

                        int targetIndex = id2 - 1;

                        service.delete(targetIndex);
                        System.out.println("삭제 완료!");

                    } catch (Exception e) {
                        System.out.println("삭제 실패: " + e.getMessage());
                    }
                    System.out.println();
                    break;

                case "0":
                    service.saveToFile(FILENAME);
                    System.out.println("프로그램을 종료합니다.");
                    return;

            }

        }
    }

}
