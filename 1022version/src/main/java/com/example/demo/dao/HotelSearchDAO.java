package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.HotelVO;

@Mapper
@Repository
public interface HotelSearchDAO {
	public HotelVO select_hotel(HotelVO vo);

}
