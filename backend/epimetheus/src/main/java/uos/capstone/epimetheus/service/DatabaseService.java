package uos.capstone.epimetheus.service;

import uos.capstone.epimetheus.dtos.TaskStep;

import java.util.Optional;

public interface DatabaseService {
    TaskStep getTaskStepByTitle(String id);
}
