package com.test.digitalplatform;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Angga [ADL.ANGGAP@xl.co.id]
 * created at 11/6/2023 7:23 PM
 */
@Data
@Accessors(chain = true)
public class ObjectDAO {
    public String name;
    public String job;
    public String id;
    public String createdAt;
}
