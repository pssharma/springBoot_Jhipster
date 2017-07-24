package com.computerworks.jhip.service.impl;

import com.computerworks.jhip.service.JobHistoryService;
import com.computerworks.jhip.domain.JobHistory;
import com.computerworks.jhip.repository.JobHistoryRepository;
import com.computerworks.jhip.service.dto.JobHistoryDTO;
import com.computerworks.jhip.service.mapper.JobHistoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * Service Implementation for managing JobHistory.
 */
@Service
public class JobHistoryServiceImpl implements JobHistoryService{

    private final Logger log = LoggerFactory.getLogger(JobHistoryServiceImpl.class);

    private final JobHistoryRepository jobHistoryRepository;

    private final JobHistoryMapper jobHistoryMapper;

    public JobHistoryServiceImpl(JobHistoryRepository jobHistoryRepository, JobHistoryMapper jobHistoryMapper) {
        this.jobHistoryRepository = jobHistoryRepository;
        this.jobHistoryMapper = jobHistoryMapper;
    }

    /**
     * Save a jobHistory.
     *
     * @param jobHistoryDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public JobHistoryDTO save(JobHistoryDTO jobHistoryDTO) {
        log.debug("Request to save JobHistory : {}", jobHistoryDTO);
        JobHistory jobHistory = jobHistoryMapper.toEntity(jobHistoryDTO);
        jobHistory = jobHistoryRepository.save(jobHistory);
        return jobHistoryMapper.toDto(jobHistory);
    }

    /**
     *  Get all the jobHistories.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Override
    public Page<JobHistoryDTO> findAll(Pageable pageable) {
        log.debug("Request to get all JobHistories");
        return jobHistoryRepository.findAll(pageable)
            .map(jobHistoryMapper::toDto);
    }

    /**
     *  Get one jobHistory by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Override
    public JobHistoryDTO findOne(String id) {
        log.debug("Request to get JobHistory : {}", id);
        JobHistory jobHistory = jobHistoryRepository.findOne(id);
        return jobHistoryMapper.toDto(jobHistory);
    }

    /**
     *  Delete the  jobHistory by id.
     *
     *  @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete JobHistory : {}", id);
        jobHistoryRepository.delete(id);
    }
}
