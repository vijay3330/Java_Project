package com.ArrayProject;

import java.util.Scanner;

public class Movieinfo 
{
	
			public static void main(String[] args) 
			{
				Movie movie[]=new Movie[3];
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the movie details");
				
				for(int i=0; i<movie.length; i++)
				{
					System.out.println("Enter movie id");
					int mid=sc.nextInt();
					System.out.println("Enter movie name");
					String mname=sc.next();
					System.out.println("Enter movie price");
					int mprice=sc.nextInt();
					System.out.println("Enter movie language");
					String mlang=sc.next();
					
					movie[i]=new Movie(mid,mname,mprice,mlang);
				}
				
				Movie mymovie=new Movie();
				mymovie.insertMovie(movie);
				System.out.println(".........Show All Movies..........");
				mymovie.showAllMovies();
				
				System.out.println("........Search Movie............");
				mymovie.findMoviebyid(1);
				
				System.out.println(".........Update Movie price...........");
				mymovie.updateMovie(1);
				
				mymovie.showAllMovies();
				
				System.out.println("..............Delete Movie..................");
				mymovie.deleteMovie(2);
				
				
				
				
			}
	
	
}
