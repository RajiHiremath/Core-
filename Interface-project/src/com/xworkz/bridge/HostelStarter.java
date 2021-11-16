package com.xworkz.bridge;
import com.xworkz.bridge.hostel.HostelRule;
import com.xworkz.bridge.hostel.SharavatiHostel;

public class HostelStarter {

	public static void main(String[] args) {
		
		HostelRule hostelrule=new SharavatiHostel();
		hostelrule.inTime();
		
		SharavatiHostel hostel=new SharavatiHostel();
		hostel.inTime();
		hostel.breakFastTime();
		hostel.visitingDay();
		}
}
