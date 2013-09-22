package org.openmrs.module.cpm.web.service;

import org.dozer.Mapper;
import org.openmrs.module.cpm.ProposedConceptResponsePackage;
import org.openmrs.module.cpm.web.dto.SubmissionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpmMapperService {

	@Autowired
	private Mapper dozerBeanMapper;

	public ProposedConceptResponsePackage convertDtoToProposedConceptResponsePackage(final SubmissionDto incomingProposal){
		return dozerBeanMapper.map(incomingProposal, ProposedConceptResponsePackage.class);
	}



}