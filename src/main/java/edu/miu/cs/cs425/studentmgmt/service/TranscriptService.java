package edu.miu.cs.cs425.studentmgmt.service;

import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import org.springframework.stereotype.Service;


public interface TranscriptService {

    public abstract void saveTranscript(Transcript transcript);
}
