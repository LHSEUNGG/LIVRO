package com.kh.livro.biz;

import java.util.List;

import com.kh.livro.dto.BroadcastDto;
import com.kh.livro.dto.CalendarDto;
import com.kh.livro.dto.MemberDto;
import com.kh.livro.dto.MusicDto;
import com.kh.livro.dto.ProfileDto;
import com.kh.livro.dto.SupportCommDto;
import com.kh.livro.dto.SupportDto;

public interface ArtistBiz {

	// 응원글 리스트
	public List<SupportDto> supportList(String member_id);

	// 응원글 작성
	public int supportInsert(SupportDto dto);

	// 응원글 수정
	public int supportUpdate(SupportDto dto);

	// 응원글 삭제
	public int supportDelete(int support_no);

	// 음원 리스트
	public List<MusicDto> selectList(String member_id);

	// 멤버 정보
	public MusicDto selectOne(String member_id);

	// 응원 댓글 리스트
	public List<SupportCommDto> commList(int support_no);

	// 응원 댓글
	public int commInsert(SupportCommDto dto);

	// 응원 댓글 삭제
	public int commDelete(int comm_no);

	// 응원 댓글 수정 
	public int commUpdate(SupportCommDto dto);

	// 프로필 정보
	public ProfileDto selectProfile(String member_id);

	// 일정 작성
	public int calInsert(CalendarDto dto);

	// 일정 목록
	public List<CalendarDto> calList(String member_id);

	// 일정 수정
	public int calUpdate(CalendarDto dto);

	// 일정 삭제
	public int calDelete(int cal_no);

	//방송 기록
	public List<BroadcastDto> broadList(String member_id);
}
