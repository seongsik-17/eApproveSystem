package com.example.eApproveSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eApproveSystem.dto.NoticeDto;
import com.example.eApproveSystem.dto.PendingDto;
import com.example.eApproveSystem.service.NoticeService;

@RestController
@RequestMapping("/notice")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/getNoticeList")
	public List<NoticeDto> getNoticeList() {
		return noticeService.getNotionList();
	}
	@GetMapping("/getPendingList")
	public List<PendingDto>getPendingList(){
		return noticeService.getPendingList();
	}
	
	@PostMapping("/writeApproval")
	public String writeApproval(@RequestBody PendingDto pendingDto) {
		try {
			noticeService.registrationRequest(pendingDto);
			return "데이터저장 성공";
		}catch(Exception e){
			return e.toString(); 
		}
	}
	@GetMapping("/getPendingById")
	public Optional<PendingDto> viewPendingDetail(@RequestParam("p_id")Integer p_id) {
		Optional<PendingDto> dto = noticeService.getpendinListByPid(p_id);
		return dto; 
		
	}
}
