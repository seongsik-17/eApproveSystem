package com.example.eApproveSystem.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_notice")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer b_id;
	
	private String b_title;
	private String b_content;
	private Date b_created_at;
	private Integer b_view;
	
	
}
