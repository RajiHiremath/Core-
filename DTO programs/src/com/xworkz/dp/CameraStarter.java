package com.xworkz.dp;
import com.xworkz.dp.dao.CameraDAO;
import com.xworkz.dp.dto.CameraDTO;

public class CameraStarter {

	public static void main(String[] args) {
		CameraDTO cameradto=new CameraDTO("Canon","Digital SLR Cameras","1800*1900",9000,7200,900.0f);
		CameraDTO cameradto1=new CameraDTO("Fujifilm Cameras","Mirrorless Cameras","600*1200",8000,880,860.0f);
		CameraDTO cameradto2=new CameraDTO("GoPro Cameras","Action Cameras","1200*500",8800,2500,2500.0f);
		CameraDTO cameradto3=new CameraDTO("Insta360 Cameras","360 Cameras","900*900",9900,7250,560.0f);
		CameraDTO cameradto4=new CameraDTO("Leica Cameras","Film Cameras","800*1600",10000,8067,780.0f);
			  
		CameraDAO cameraDAO=new CameraDAO();
		cameraDAO.save(cameradto1);
		cameraDAO.save(cameradto3);
		cameraDAO.save(cameradto4);
		cameraDAO.save(cameradto);

		CameraDTO[] ref=cameraDAO.getCameraDTOs();
		for(int count=0;count<ref.length;count++)
		{
			CameraDTO ref1=ref[count];
			if(ref1!=null)
			{
			System.out.println(ref1.getCompany());
			System.out.println(ref1.getType());
			System.out.println(ref1.getPixel());
			System.out.println(ref1.getCost());
			System.out.println(ref1.getBatteryCapacity());
			System.out.println(ref1.getWeight());
			System.err.println("!!!!!!!!!!!!!!!!");
			}
			else
			{
				System.err.println("Refence is pointing to null :" .concat(String.valueOf(count)));
			}
		 }
		cameraDAO.delete(1);
		cameraDAO.displayDetails();
		}
		

	}
