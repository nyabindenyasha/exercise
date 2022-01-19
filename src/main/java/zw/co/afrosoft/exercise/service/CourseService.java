package zw.co.afrosoft.exercise.service;

import zw.co.afrosoft.exercise.domain.Course;
import zw.co.afrosoft.exercise.domain.Lecturer;
import zw.co.afrosoft.exercise.dto.CourseRequestDto;
import zw.co.afrosoft.exercise.dto.CourseResponseDto;


public interface CourseService {
    CourseResponseDto createCourse(CourseRequestDto CourseRequestDto);

    CourseResponseDto getCourseById(Long courseId);

}