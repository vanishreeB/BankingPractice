package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount =3;
	
	static{
		todos.add(new Todo(1, "vanishree","learning spring" , new Date(), false));
		todos.add(new Todo(2, "vanishree","learning java" , new Date(), false));
		todos.add(new Todo(3, "vanishree","learning hibernate" , new Date(), false));
		
	}
	
	public void addTodo ( String name,String desc,Date targetDate,boolean isDone){
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone)); 
	}
	
	public void deleteTodo(int id ){
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()){
			Todo todo =  iterator.next();
			 if(todo.getId()==id){
				 iterator.remove();
			 }
		}
	}
	
	public List<Todo> retrivetodo(String user ){
		List<Todo> filtertodo = new ArrayList<Todo>();
		for(Todo todo: todos){
			if(todo.getUser().equals(user)){
				filtertodo.add(todo);
			}
		}
		return filtertodo;
	
	}
}

