create index IX_809167C6 on EDC_ExperimentalGroup (companyId);
create index IX_79E00FFC on EDC_ExperimentalGroup (groupId, projectId);
create index IX_EA53C95C on EDC_ExperimentalGroup (userId);
create index IX_36D77096 on EDC_ExperimentalGroup (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_178F2498 on EDC_ExperimentalGroup (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CFCFF699 on EDC_InstResearcher (companyId);
create index IX_85A97E89 on EDC_InstResearcher (groupId, projectId);
create index IX_D7F33AD4 on EDC_InstResearcher (institutionId);
create index IX_DE7B0BE6 on EDC_InstResearcher (researcherId);
create index IX_B84CE369 on EDC_InstResearcher (userId);
create index IX_6B551E63 on EDC_InstResearcher (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_5747E1A5 on EDC_InstResearcher (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D23B8DB8 on EDC_InstanceLink (companyId);
create index IX_F23C7A4A on EDC_InstanceLink (groupId, projectId);
create index IX_FE702A73 on EDC_InstanceLink (institutionId);
create index IX_10B46DC4 on EDC_InstanceLink (subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId, instanceId);
create index IX_B2B8AA on EDC_InstanceLink (userId);
create index IX_50461664 on EDC_InstanceLink (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_68E5E6 on EDC_InstanceLink (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_911E5665 on EDC_Institution (companyId);
create index IX_479C243D on EDC_Institution (groupId, projectId);
create index IX_FA63771D on EDC_Institution (userId);
create index IX_8D5DA117 on EDC_Institution (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_AF398159 on EDC_Institution (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C81AD9B5 on EDC_MetaCode (companyId);
create index IX_17F65AED on EDC_MetaCode (groupId, projectId);
create index IX_ACD635CD on EDC_MetaCode (userId);
create index IX_7335C3C7 on EDC_MetaCode (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_891A9009 on EDC_MetaCode (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1A1AAC24 on EDC_Project (companyId);
create index IX_2DE7EBA6 on EDC_Project (groupId);
create index IX_75C82678 on EDC_Project (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B597EAFA on EDC_Project (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E33C87EB on EDC_Query (answerUserID);
create index IX_A45F711B on EDC_Query (closeUserID);
create index IX_45F31595 on EDC_Query (companyId);
create index IX_5A737B0D on EDC_Query (groupId, projectId);
create index IX_A92E1B87 on EDC_Query (itemCode);
create index IX_A8DA23D7 on EDC_Query (openUserId);
create index IX_22DD1ECA on EDC_Query (reopenId, ruleId);
create index IX_30A664C7 on EDC_Query (subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId, instanceId);
create index IX_AAEA85ED on EDC_Query (userId);
create index IX_FCBC6BE7 on EDC_Query (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1E6CC029 on EDC_Query (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8C4E5985 on EDC_QueryLink (answerUserID);
create index IX_DB600441 on EDC_QueryLink (closeUserID);
create index IX_AE2A3A3B on EDC_QueryLink (companyId);
create index IX_FBA43127 on EDC_QueryLink (groupId, projectId);
create index IX_B4CCCA21 on EDC_QueryLink (itemCode);
create index IX_478793F1 on EDC_QueryLink (openUserId);
create index IX_65189364 on EDC_QueryLink (reopenId, ruleId);
create index IX_E7DE6661 on EDC_QueryLink (subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId, instanceId);
create index IX_B3B81307 on EDC_QueryLink (userId);
create index IX_3EF7E081 on EDC_QueryLink (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CA509343 on EDC_QueryLink (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_918521BC on EDC_Randomization (companyId);
create index IX_1E94333D on EDC_Randomization (expGroupId);
create index IX_9B9F2AC6 on EDC_Randomization (groupId, projectId);
create index IX_501D4326 on EDC_Randomization (userId);
create index IX_4A52B5E0 on EDC_Randomization (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_FACF3462 on EDC_Randomization (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_299ECE3F on EDC_Researcher (companyId);
create index IX_4D631B6B on EDC_Researcher (researcherUserId);
create index IX_CA9E8025 on EDC_Researcher (userId, researcherUserId);
create index IX_86797FFD on EDC_Researcher (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_3E96D8F1 on EDC_Subject (companyId);
create index IX_13B962A8 on EDC_Subject (expGroupId);
create index IX_24BFBF31 on EDC_Subject (groupId, projectId);
create index IX_E951312C on EDC_Subject (institutionId);
create index IX_24DF398D on EDC_Subject (projectId);
create index IX_B80E011 on EDC_Subject (userId);
create index IX_70D3690B on EDC_Subject (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_71A8B64D on EDC_Subject (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D0B9D455 on EDC_SubjectVisitDefinition (companyId);
create index IX_4777544D on EDC_SubjectVisitDefinition (groupId, projectId);
create index IX_B70234F1 on EDC_SubjectVisitDefinition (projectId);
create index IX_CB12FD84 on EDC_SubjectVisitDefinition (subjectId);
create index IX_65FA3F2D on EDC_SubjectVisitDefinition (userId);
create index IX_EF659527 on EDC_SubjectVisitDefinition (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DFCF3969 on EDC_SubjectVisitDefinition (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_977518EE on EDC_SubjectVisitDefinition (visitCRFId);
create index IX_A076EB16 on EDC_SubjectVisitDefinition (visitGroupId);

create index IX_32A44B5F on EDC_VisitDefinition (companyId);
create index IX_1B412883 on EDC_VisitDefinition (groupId, projectId);
create index IX_18ECABFB on EDC_VisitDefinition (projectId);
create index IX_C0683463 on EDC_VisitDefinition (userId);
create index IX_2CE2FEDD on EDC_VisitDefinition (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_41E7989F on EDC_VisitDefinition (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_72D98324 on EDC_VisitDefinition (visitCRFId);
create index IX_322B29F2 on EDC_VisitDefinition (visitDefinitionCode[$COLUMN_LENGTH:75$]);
create index IX_34699FCC on EDC_VisitDefinition (visitGroupId);

create index IX_55C2918 on EDC_VisitEvent (companyId);
create index IX_5624AAEA on EDC_VisitEvent (groupId, projectId);
create index IX_B3E2AE05 on EDC_VisitEvent (institutionId, subjectId, visitDefinitionId);
create index IX_FFB55247 on EDC_VisitEvent (subjectId);
create index IX_1FE6D94A on EDC_VisitEvent (userId);
create index IX_A3C1EF04 on EDC_VisitEvent (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E4426686 on EDC_VisitEvent (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_913E153 on EDC_VisitGroup (companyId);
create index IX_A689050F on EDC_VisitGroup (groupId, projectId);
create index IX_7F8D82EF on EDC_VisitGroup (userId);
create index IX_1D508E69 on EDC_VisitGroup (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_FB4B9B2B on EDC_VisitGroup (uuid_[$COLUMN_LENGTH:75$], groupId);