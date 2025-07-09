package com.example.eApproveSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eApproveSystem.dto.NoticeDto;
import com.example.eApproveSystem.dto.PendingDto;
import com.example.eApproveSystem.entity.Notice;
import com.example.eApproveSystem.entity.Pending;
import com.example.eApproveSystem.repository.NoticeRepository;
import com.example.eApproveSystem.repository.PendingRepository;

@Service
public class NoticeService {
	@Autowired
	private NoticeRepository noticeRepository;
	@Autowired
	private PendingRepository pendingRepository;

	// DTO → Entity
	public Pending convertToEntity(PendingDto dto) {
		Pending entity = new Pending();
		entity.setP_id(dto.getP_id());
		entity.setB_id(dto.getB_id());
		entity.setB_title(dto.getB_title());
		entity.setB_content(dto.getB_content());
		entity.setB_created_at(dto.getB_created_at());
		entity.setStatus(dto.getStatus());
		entity.setAdmin_comment(dto.getAdmin_comment());
		entity.setRejected_comment(dto.getRejected_comment());
		return entity;
	}

	// Entity → DTO
	public PendingDto convertToDto(Pending entity) {
		PendingDto dto = new PendingDto();
		dto.setP_id(entity.getP_id());
		dto.setB_id(entity.getB_id());
		dto.setB_title(entity.getB_title());
		dto.setB_content(entity.getB_content());
		dto.setB_created_at(entity.getB_created_at());
		dto.setStatus(entity.getStatus());
		dto.setAdmin_comment(entity.getAdmin_comment());
		dto.setRejected_comment(entity.getRejected_comment());
		return dto;
	}

	public void registrationRequest(PendingDto pendingDto) {
		pendingRepository.save(convertToEntity(pendingDto));

	}

	public List<NoticeDto> getNotionList() {
		List<Notice> list = noticeRepository.findAll();
		List<NoticeDto> dtoList = new ArrayList<>();
		for (Notice n : list) {
			NoticeDto dto = new NoticeDto();
			dto.setB_id(n.getB_id());
			dto.setB_title(n.getB_title());
			dto.setB_content(n.getB_content());
			dto.setB_created_at(n.getB_created_at());
			dto.setB_view(n.getB_view());
			dtoList.add(dto);
		}
		return dtoList;
	}

	public List<PendingDto> getPendingList() {
		List<Pending> list = pendingRepository.findAll();
		List<PendingDto> dtoList = new ArrayList<>();
		for (Pending p : list) {
			PendingDto dto = new PendingDto();
			dto.setP_id(p.getP_id());
			dto.setB_id(p.getB_id());
			dto.setB_title(p.getB_title());
			dto.setB_content(p.getB_content());
			dto.setB_created_at(p.getB_created_at());
			dto.setStatus(p.getStatus());
			dto.setAdmin_comment(p.getAdmin_comment());
			dto.setRejected_comment(p.getRejected_comment());
			dtoList.add(dto);
		}
		return dtoList;
	}

	public Optional<PendingDto> getpendinListByPid(Integer p_id) {
		Optional<Pending> pending = pendingRepository.findById(p_id);
	
	    return pendingRepository.findById(p_id).map(this::convertToDto);
		
	}

}
