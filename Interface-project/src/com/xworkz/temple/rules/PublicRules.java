package com.xworkz.temple.rules;

import com.xworkz.temple.devotee.DevoteeRule;

public class PublicRules implements DevoteeRule
{

	@Override
	public boolean slipperOFF() {
		System.out.println("invoked Slipper is Off");
		return true;
	}

	@Override
	public boolean dontTakePhoto() {
		System.out.println("invoked dont take photos");
		return true;
	}

	@Override
	public boolean maintainSilence() {
	System.out.println("invoked maintained silence ");
		return true;
	}
     
}
