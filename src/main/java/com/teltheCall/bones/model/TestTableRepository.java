package com.teltheCall.bones.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTableRepository extends PagingAndSortingRepository<TestTable, Long> {

  @Query("SELECT tt FROM TestTable tt WHERE tt.id = :testTableId")
  TestTable findById(@Param("testTableId") long testTableId);
}
