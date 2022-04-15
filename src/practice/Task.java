package practice;

import java.time.LocalDate;
import java.util.Comparator;

public class Task {
	private  LocalDate localDate;
	private  String taskDetail;

	public Task(int year, int month, int day, String taskDetail) {
		LocalDate localDate = LocalDate.of(year, month, day);
		this.localDate = localDate;
		this.taskDetail = taskDetail;
	}
	
	public void printTask() {
		System.out.println(this.localDate + ":" + this.taskDetail);
	}
	
	static class SortByLocalDate implements Comparator<Task> {
		@Override
		public int compare(Task a, Task b) {
			return a.localDate.compareTo(b.localDate);
		}
	}
}
