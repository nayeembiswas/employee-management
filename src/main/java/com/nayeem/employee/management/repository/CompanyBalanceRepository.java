/**
 * @Since Feb 26, 2021
 * @Author Nayeem Biswas
 * @Project employee-management
 * @Package employee-management
 */
package com.nayeem.employee.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nayeem.employee.management.model.entity.CompanyBalance;

/**
 * @author Nayeem
 *
 */
public interface CompanyBalanceRepository extends JpaRepository<CompanyBalance, Integer> {

}
