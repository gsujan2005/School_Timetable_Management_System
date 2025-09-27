package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScheduleEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String className;
    private String subject;
    private String teacherName;
    private String dayOfWeek;
    private String startTime;
    private String endTime;
    private String attendanceNote;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public String getAttendance() {
        return attendanceNote;
    }
    public void setAttendance(String attendanceNote) {
        this.attendanceNote = attendanceNote;
    }
    public ScheduleEntry(Long id, String className, String subject, String teacherName, String dayOfWeek,
            String startTime, String endTime, String attendanceNote) {
        this.id = id;
        this.className = className;
        this.subject = subject;
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.attendanceNote = attendanceNote;
    }
    public ScheduleEntry() {
    }

}
