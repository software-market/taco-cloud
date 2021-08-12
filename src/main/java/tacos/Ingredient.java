package tacos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data // lombok 基础注解
@RequiredArgsConstructor // 配合final 生成有参构造
@NoArgsConstructor(force = true) // 生成一个无参构造
@Entity // 实体
public class Ingredient {
    @Id
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}

