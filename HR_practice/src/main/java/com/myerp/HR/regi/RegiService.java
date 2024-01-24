package com.myerp.HR.regi;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.myerp.HR.entity.Employee;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RegiService {
	
	private final RegiRepository regiRepository;
	
    public void regi(Long employeeId,
            String name,
            Date startDate,
            String deptName,
            String position,
            String email,
            String bankNum,
            int regularPay) {
        	
            // 받아온 데이터로 Employee 객체 생성
            Employee employee = new Employee();
            employee.setEmployeeId(employeeId);
            employee.setName(name);
            employee.setStartDate(startDate);
            employee.setDeptName(deptName);
            employee.setPosition(position);
            employee.setEmail(email);
            employee.setBankNum(bankNum);
            employee.setRegularPay(regularPay);

            // 데이터베이스에 저장
            regiRepository.save(employee);
    }
}
