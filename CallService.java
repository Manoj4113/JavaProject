package com.callcenter;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallService {

	@Autowired
	Repo repo;
	public String hourWithHighVolume() {
		
//		CallDetails c=new CallDetails();
//		c.setFromNumber("9999900006");
//		c.setStartTime(LocalDateTime.of(2021, 1, 10, 15, 12, 49));
//		c.setEndTime(LocalDateTime.of(2021, 1, 10, 15, 14, 44));
//		Duration d=Duration.between( c.getStartTime(),c.getEndTime());
//		c.setDuration((int)d.getSeconds());
//		repo.save(c);
		List<CallDetails>l=repo.findAll();
		Map<Integer,Integer>mp=new TreeMap<>();
		
		for(var e:l) {
			var st=e.getStartTime();
			var et=e.getEndTime();
			Integer a=st.getHour();
			Integer b=et.getHour();
			if(mp.containsKey(a)) {
				mp.put(a,mp.get(a)+1);
			}else mp.put(a, 1);
			if(mp.containsKey(b)) {
				mp.put(a,mp.get(b)+1);
			}else mp.put(b, 1);
			
		}
		int ans=0;
		Integer t=0;
		for(var e:mp.entrySet()) {
			if(e.getValue()>ans) {
				ans=e.getValue();
				t=e.getKey();
				
			}
		}
		String res="";
		res+=t;
		res+="-";
		res+=(t+1);
		return res;
		
		
		
	}

	public String hourWithLongestCall() {
		List<CallDetails>l=repo.findAll();
		
		int ans=0;
		int dur=0;
		for(var e:l) {
			if(e.getDuration()>dur) {
				dur=e.getDuration();
				ans=e.getStartTime().getHour();
				
			}
			
			
		}
	int t=ans;
		String res="";
		res+=t;
		res+="-";
		res+=(t+1);
		return res;
	}

	public String dayWithHighVolume() {
		List<CallDetails>l=repo.findAll();
		Map<Integer,Integer>mp=new TreeMap<>();
		
		for(var e:l) {
			var st=e.getStartTime();
			var et=e.getEndTime();
			Integer a=st.getDayOfWeek().getValue();
			Integer b=et.getDayOfWeek().getValue();
			if(mp.containsKey(a)) {
				mp.put(a,mp.get(a)+1);
			}else mp.put(a, 1);
			if(mp.containsKey(b)) {
				mp.put(a,mp.get(b)+1);
			}else mp.put(b, 1);
			
		}
		int ans=0;
		Integer t=0;
		for(var e:mp.entrySet()) {
			if(e.getValue()>ans) {
				ans=e.getValue();
				t=e.getKey();
				
			}
		}
		String res="";
		res+=t;
		res+="-";
		res+=(t+1);
		return res;
	}

	public String dayWithLongestCall() {
List<CallDetails>l=repo.findAll();
		
		int ans=0;
		int dur=0;
		for(var e:l) {
			if(e.getDuration()>dur) {
				dur=e.getDuration();
				ans=e.getStartTime().getDayOfWeek().getValue();
				
			}
			
			
		}
	int t=ans;
		String res="";
		res+=t;
		res+="-";
		res+=(t+1);
		return res;
		
	}
	

}
