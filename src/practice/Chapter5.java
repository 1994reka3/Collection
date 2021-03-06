package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(2021, 10, 21, "牛乳を買う。"));
		tasks.add(new Task(2021, 9, 15, "○○社面談。"));
		tasks.add(new Task(2021, 12, 4, "手帳を買う。"));
		tasks.add(new Task(2021, 8, 10, "散髪に行く。"));
		tasks.add(new Task(2021, 11, 9, "スクールの課題を解く。"));
		// Listを日付順に並び替え
		Collections.sort(tasks, new Task.SortByLocalDate());
		// printTaskメソッドを呼び出してListの中身を表示
		for (Task task : tasks) {
			task.printTask();
		}
	}

}
