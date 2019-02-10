package com.example.hajiboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//このアノテーションをつけることによって様々な設定が自動的に有効になる
@SpringBootApplication
//「@RestController」をつけることでこのクラスが「Webアプリケーション」においてリクエストを受け付ける「コントローラークラス」になることを示す
@RestController
public class HajibootApplication {

	//「HTTPリクエスト」をGetメソッドで受けるけるためにのメソッドであることを示す「@GetMapping」アノテーションをつける
	//このアプリケーションに「/」といいうパスでアクセスがあった場合に「homeメソッド」が呼ばれる
	@GetMapping("/")
	String home() {
		//「㏋TTPレスポンス」を記述
		//「@RestController」アノテーションがついているクラスのメソッドで文字列を返した場合はその文字列がそのまま「HTTPレスポンス」として出力される
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		//「Spring Boot」アプリケーションを実行するための処理を「main」メソッド内に記述
		SpringApplication.run(HajibootApplication.class, args);
	}
	
}

