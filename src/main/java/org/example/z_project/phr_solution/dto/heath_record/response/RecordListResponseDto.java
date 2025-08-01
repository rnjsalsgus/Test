package org.example.z_project.phr_solution.dto.heath_record.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class RecordListResponseDto {
    private Long id;
    private Long patientId;
    private String dateOfVisit;
    private String diagnosis;
    private String treatment;
//    엔티티에 없는 데이터
    private Date inquiryTime; // 건강기록 조회시간
}
