package com.example.demo.task;

import com.example.demo.configuration.MyBatisConnection;
import com.example.demo.repository.DemoRepository;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
@EnableAsync
public class ScheduledTask {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTask.class);

    // Inyección de Dependencia
    DemoRepository seguroRepository;

    public ScheduledTask(DemoRepository seguroRepository) {
        this.seguroRepository = seguroRepository;
    }

    @Async
    @Scheduled(fixedRateString = "5000")
    public void notificarSeguroAsync() throws SQLException {


        seguroRepository.getSeguroRatificacionEstado();

        LOG.info("hola");
    }

}
