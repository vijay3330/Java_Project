package com.ArrayProject;

import java.util.Scanner;

public class Movie 
{
		int movie_id;
		String movie_name;
		int price;
		String lang;
		Movie[] movie;
		Scanner sc;
		
		public Movie()
		{
			sc=new Scanner(System.in);
		}
		
		public Movie(int movie_id, String movie_name, int price, String lang) {
			
			this.movie_id = movie_id;
			this.movie_name = movie_name;
			this.price = price;
			this.lang = lang;
		}
		@Override
		public String toString() {
			return "[movie_id=" + movie_id + ", movie_name=" + movie_name + ", price=" + price + ", lang=" + lang
					+ "]";
		}
		
		public void insertMovie(Movie[] movie)
		{
			this.movie=movie;
		}
		
		public void showAllMovies()
		{
			for(int i=0; i<movie.length; i++)
			{
				if(movie[i]!=null)
				{
					System.out.println(movie[i]);
				}
				
			}
		}
		
		public void findMoviebyid(int id)
		{
			for(int i=0; i<movie.length; i++)
			{
				if(movie[i]!=null)
				{
					if(movie[i].movie_id==id)
					{
						System.out.println(movie[i]);
					}
				}
			}
		}
		
		public void updateMovie(int id)
		{
			System.out.println("Enter the price for updatetion");
			int price=sc.nextInt();
			boolean isupdated=false;
			for(int i=0; i<movie.length; i++)
			{
				if(movie[i]!=null)
				{
					if(movie[i].movie_id==id)
					{
						movie[i].price=price;
						isupdated=true;
					}
				}
			}
			
			if(isupdated==true)
			{
				System.out.println("Update succesfully...");
			}
			else
			{
				System.out.println("please check Something is wrong...");
			}
		}
		
		
		public void deleteMovie(int id)
		{
			for(int i=0; i<movie.length; i++)
			{
				if(movie[i]!=null)
				{
					if(movie[i].movie_id==id)
					{
						for(int j=i; j<movie.length-1; j++)
						{
							movie[j]=movie[j+1];
						}
						break;
					}
				}
			}
			for(int i=0; i<movie.length-1; i++)
			{
				System.out.println(movie[i]);
			}
		}
}
