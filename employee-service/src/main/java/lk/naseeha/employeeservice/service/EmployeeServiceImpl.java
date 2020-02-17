package lk.naseeha.employeeservice.service;

import lk.naseeha.employeeservice.Repository.EmployeeRepository;
import lk.naseeha.employeeservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmpService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        employeeRepository.save(employee);

        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(Integer id) {
        return employeeRepository.findById(id);
    }
}