package me.personal.model;

import lombok.Builder;
import lombok.Data;
import me.personal.constance.EsConst;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Document 注解主要声明索引名、类型名、分片数量和备份数量
 * @Field 注解主要声明字段对应ES的类型
 */

@Document(indexName = EsConst.INDEX_NAME, type = EsConst.TYPE_NAME, shards = 1, replicas = 0)
@Data
@Builder
public class Person {
    @Id
    private Long id;

    @Field(type = FieldType.Keyword)
    private String name;

    @Field(type = FieldType.Keyword)
    private Integer age;
}
