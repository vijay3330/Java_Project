package com.ArrayOFObject;

public class Movie 
{
		private int movie_id;
		private String movie_name;
		private float rating;
		
		public int getMovie_id() {
			return movie_id;
		}
		public void setMovie_id(int movie_id) {
			this.movie_id = movie_id;
		}
		public String getMovie_name() {
			return movie_name;
		}
		public void setMovie_name(String movie_name) {
			this.movie_name = movie_name;
		}
		public float getRating() {
			return rating;
		}
		public void setRating(float rating) {
			this.rating = rating;
		}
		@Override
		public String toString() {
			return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + ", rating=" + rating + "]";
		}
		
		
		
}
