package com.example.demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws URISyntaxException, IOException {
		
//		final String username = "ankur.luthra@edcast.com";
//		final String password = "11107694555583aa839f17f29534e0f210";
//		JenkinsServer jenkins = new JenkinsServer(new URI("https://build.itpx.one"), username, password);
//		JobWithDetails job = jenkins.getJob("solar-core-test");
		
//		View view = jenkins.getView("QA-Build-View"); // getJob("ALL PROD Frontend Views");
//		Build lastSuccessfulBuild = job.getLastSuccessfulBuild();
		
//		JobWithDetails job = jenkins.getJob("phoenix-test");
//		job.
		
		
		CompletableFuture.runAsync(()->{
			OkHttpClient client = new OkHttpClient().newBuilder()
					  .build();
					MediaType mediaType = MediaType.parse("text/plain");
					RequestBody body = RequestBody.create(mediaType, "");
					Request request = new Request.Builder()
					  .url("https://amber.itpx.one/api/solar/platform/support/populate/multiple-tm?entityName=Course-Events")
					  .method("POST", body)
					  .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYwZWMzN2JiODFmMmFjMGVjOWI2OTMwYiIsInVzZXJuYW1lIjoiYW5rdXIubHV0aHJhQGVkY2FzdC5jb20iLCJkb21haW4iOiJjb3ZpZDE5IiwiZ3JvdXBzIjpbImFkbWluaXN0cmF0b3IiLCJidXllci1hZG1pbiJdLCJyb290IjoiYmRiOTczODAtOGRiNC0xMWVjLTk4MWQtMzEzYWE5ODAxYmJlIiwiYWx0ZXJuYXRpdmVBY2NvdW50cyI6ZmFsc2UsImlhdCI6MTY0NDkzOTE0NywiZXhwIjoxNjQ0OTU3MTQ3fQ.KthsYAr0JANxos7SY3jh50vST-Ms8u7xtYZWRJh2lKc")
					  .build();
					try {
						Response response = client.newCall(request).execute();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		});

	}

}
