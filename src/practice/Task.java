package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task {
	private  LocalDate localDate;
	private  String task;

	public Task(int year, int month, int day, String task) {
		LocalDate localDate = LocalDate.of(year, month, day);
		this.localDate = localDate;
		this.task = task;
		return;
	}

}
