package tw.zhenruyijewelry.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdRepository extends JpaRepository<Bird, Integer> {
//BirdRepository 相當於 dao的腳色, 因為她繼承JpaRepository
}
