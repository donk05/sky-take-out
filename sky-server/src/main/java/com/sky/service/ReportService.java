package com.sky.service;

import com.sky.vo.TurnoverReportVO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

//@Service
public interface ReportService {
    TurnoverReportVO getTurnover(LocalDate begin, LocalDate end);

}
