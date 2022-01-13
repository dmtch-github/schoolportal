package com.kataacademy.schoolportal.common.models.schoolatribute;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Form {

    private byte number;
    private String classRoomName;
    private String fullClassRoomName;
    private List<Pupil> pupilList = new ArrayList<>();
    private Teacher classroomTeacher;
    private String classRoomProfile;

}
