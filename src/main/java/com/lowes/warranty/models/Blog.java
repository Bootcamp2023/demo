package com.lowes.warranty.models;

//import com.couchbase.client.java.repository.annotation.Field;
//import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@Document
public class Blog {
	
	@Id
	String id;

	@Field
	String topicname;
	@Field
	String author;
	@Field
	String content;
}
