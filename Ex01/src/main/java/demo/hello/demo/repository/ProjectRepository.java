package demo.hello.demo.repository;

import demo.hello.demo.model.Project;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

@Repository
public class ProjectRepository {

    private final List<Project> projects = List.of(

            new Project(
                    "P01",
                    "Hệ thống quản lý bệnh viện",
                    "Xây dựng hệ thống quản lý hồ sơ bệnh nhân và lịch khám",
                    "Nguyễn Văn An",
                    createDate(2021, 1, 10),
                    createDate(2022, 6, 30),
                    15
            ),

            new Project(
                    "P02",
                    "Ứng dụng đặt vé xem phim",
                    "App mobile cho phép đặt vé và thanh toán online",
                    "Trần Thị Bình",
                    createDate(2022, 3, 5),
                    createDate(2023, 1, 20),
                    10
            ),

            new Project(
                    "P03",
                    "Nền tảng học trực tuyến",
                    "Website học online với video và bài tập",
                    "Lê Minh Cường",
                    createDate(2020, 9, 1),
                    createDate(2022, 12, 15),
                    20
            ),

            new Project(
                    "P04",
                    "Hệ thống quản lý kho",
                    "Quản lý nhập xuất tồn kho cho doanh nghiệp",
                    "Phạm Thu Hương",
                    createDate(2023, 2, 10),
                    createDate(2024, 5, 25),
                    8
            ),

            new Project(
                    "P05",
                    "AI Chatbot chăm sóc khách hàng",
                    "Ứng dụng AI hỗ trợ trả lời tự động",
                    "Hoàng Văn Nam",
                    createDate(2022, 7, 18),
                    createDate(2023, 11, 30),
                    12
            )
    );

    public List<Project> findAll() {
        return projects;
    }

    public Project findById(String id) {
        return projects.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private java.util.Date createDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.getTime();
    }
}