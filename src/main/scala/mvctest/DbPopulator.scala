package mvctest

import mvctest.domain.Hotel
import mvctest.service.HotelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
  * Created by USER on 2018-02-27.
  */
@Component
//class DbPopulator @Autowired()(val hotelRepository: HotelRepository) extends CommandLineRunner {
class DbPopulator extends CommandLineRunner {
  @Autowired
  private val hotelRepository : HotelRepository = null

  override def run(args: String*): Unit = {
    (1 to 10).foreach(i => {
      hotelRepository.save(new Hotel(id=null, name = s"Hotel $i", address = s"Address $i", zip = s"Zip $i"))
    })
  }
}
