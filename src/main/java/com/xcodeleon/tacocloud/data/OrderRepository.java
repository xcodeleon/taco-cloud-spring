package com.xcodeleon.tacocloud.data;

import com.xcodeleon.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
