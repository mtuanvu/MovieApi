package com.movieflix.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor //Tự động tạo constructor rỗng
@AllArgsConstructor //Tự động tạo constructor đầy đủ tham số
public class Movie {
    @Id //Đánh dấu khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Chỉ định id của khóa chính tự động sinh ra
    private Integer movieId;

    @Column(nullable = false, length = 250) //Ánh xạ tới một cột, đảm bảo rằng cột trong db không được null
    @NotNull(message = "Please provide movie's title!") //Không được để null
    private String title;

    @Column(nullable = false)
    @NotNull(message = "Please provide movie's director!")
    private String director;

    @Column(nullable = false)
    @NotNull(message = "Please provide movie's studio!")
    private String studio;

    @ElementCollection //Đánh dấu thuộc tính này là một tợp hợp các giá trị đơn giản, không phải là một Entity độc lập
    @CollectionTable(name = "movie_cast") //Chỉ định tên bảng phụ lưu trữ các thuộc tính này
    private Set<String> movieCast;

    @Column(nullable = false)
    private Integer releaseYear;

    @Column(nullable = false)
    @NotNull(message = "Please provide movie's poster!")
    private String poster;
}
