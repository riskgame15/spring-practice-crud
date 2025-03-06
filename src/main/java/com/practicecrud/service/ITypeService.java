package com.practicecrud.service;

import com.practicecrud.model.DTO.TypeDTO;
import com.practicecrud.model.Type;

public interface ITypeService extends IGenerateService<Type>{
    Iterable<TypeDTO> getType();
}
