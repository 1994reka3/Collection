package practice;

import java.time.LocalDate;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Chapter5 {
	public static void main(String[] args) {

//		// コレクションの中身を表示する
//		for(Map.Entry<LocalDate, String> task : tasks.entrySet()) {
//			System.out.println(task.getKey() + "：" + task.getValue());
//		}
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(2021, 10, 21, "牛乳を買う。"));
		tasks.add(new Task(2021, 9, 15, "○○社面談。"));
		tasks.add(new Task(2021, 12, 4, "手帳を買う。"));
		tasks.add(new Task(2021, 8, 10, "散髪に行く。"));
		tasks.add(new Task(2021, 11, 9, "スクールの課題を解く。"));
		
		System.out.println(tasks);
	}

}
