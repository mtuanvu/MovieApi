package com.movieflix.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private Integer movieId;

    @NotNull(message = "Please provide movie's title!") //Không được để null
    private String title;

    @NotNull(message = "Please provide movie's director!")
    private String director;

    @NotNull(message = "Please provide movie's studio!")
    private String studio;

    private Set<String> movieCast;

    private Integer releaseYear;

    @NotNull(message = "Please provide movie's poster!")
    private String poster;

    @NotNull(message = "Please provide poster's url!")
    private String posterUrl;
}