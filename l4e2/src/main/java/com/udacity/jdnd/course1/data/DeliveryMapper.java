package com.udacity.jdnd.course1.data;

import org.apache.ibatis.annotations.*;

//The findDelivery (or select) method should take the id of our Delivery class and return the corresponding Delivery object.
//        The insert method should take a Delivery object and create a new record with the orderId and time. It should generate a new id and return that id.
//        The delete method should take an id and delete that record from the database. It doesn’t need to return anything.
@Mapper
public interface DeliveryMapper {

    @Select("Select * FROM Delivery where id = #{id}")
    Delivery findDelivery(int id);

    @Insert("Insert into Delivery (id, orderId, time) VALUES (#{id, orderId, time})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Delivery delivery);

    @Delete("Delete from Delivery where id = #{id}")
    void delete(int id);
}
