package project.coursera.service.Impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import project.coursera.service.ReadFromFileService;

@Service
public class ReadFromFileServiceImpl implements ReadFromFileService {

    private final StringBuilder builder;

    public ReadFromFileServiceImpl(StringBuilder builder) {
        this.builder = builder;
    }


    @Override
    public String printStatistics() {


        return null;
    }
}
