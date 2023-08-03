package com.fabiogontijo.dslist.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GameInput {


    private String title;

    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;

    private String shortDescription;

    private String longDescription;
}
