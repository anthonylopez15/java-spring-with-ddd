package com.anthony.admin.catalog.application.category.create;

import com.anthony.admin.catalog.application.UseCase;
import com.anthony.admin.catalog.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
