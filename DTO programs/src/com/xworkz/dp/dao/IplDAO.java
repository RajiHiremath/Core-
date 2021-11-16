package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTO;
public class IplDAO
{
    private IplDTO[] iplDTOs = new IplDTO[999];
		private int octopus = 0;

		public void create(IplDTO dto) 
		{
			System.out.println("create iplDTOs cost");

			if (this.octopus < this.iplDTOs.length && this.octopus >= 0) 
			{
				this.iplDTOs[this.octopus++] = dto;
			} 
			else 
			{
				System.out.println("Cannot create the iplDTOs :".concat(String.valueOf(this.octopus)));
			}
		}

		public void create(IplDTO dto, int index) 
		{
			System.out.println("create iplDTOs dto and int cost:".concat(dto.getName()));
			if (index>=0 && this.octopus < this.iplDTOs.length && this.octopus >= 0&& dto!=null) 
			{
				this.iplDTOs[this.octopus++] = dto;
				System.out.println("create iplDTOs dto and int cost:".concat(String.valueOf(index)));
			} 
			else 
			{
				System.out.println("Cannot create the iplDTOs :".concat(String.valueOf(this.octopus)));
			}
		}
		public int indexOccupied() 
		{
			System.out.println("indexOccupied".concat(String.valueOf(octopus)));
			return octopus;
		}

		public boolean matchIplByName(String teamName) 
		{
			System.out.println("invoked matchIplByName");
			System.out.println("team name passed: ".concat(teamName));

			for (int deathNote = 0; deathNote < this.iplDTOs.length; deathNote++) 
			{
				IplDTO ref = this.iplDTOs[deathNote];
				if (ref != null) 
				{
					System.out.println("ref in index is not null: ".concat(String.valueOf(deathNote)));
					String tempName = ref.getName();
					System.out.println("matching: ".concat(tempName));
					if (teamName.equals(tempName))
					{
						System.out.println("team name found");
						return true;
					}

				}
			}
			return false;
		}

	}


