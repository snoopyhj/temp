package com.example.demo.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.HotelVO;

@Mapper
@Repository
public interface RegionSearchDAO {
	public ArrayList<HotelVO> select_region(HotelVO vo);
}