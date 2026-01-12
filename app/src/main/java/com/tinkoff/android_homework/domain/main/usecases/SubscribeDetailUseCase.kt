package com.tinkoff.android_homework.domain.main.usecases

import com.tinkoff.android_homework.data.network.repo.detail.SubscribeDetailRepository
import com.tinkoff.android_homework.domain.main.entities.Detail
import javax.inject.Inject

interface SubscribeDetailUseCase {
    suspend fun getDetail(id: Int): Detail
}

class SubscribeDetailUseCaseImpl @Inject constructor(
    private val detailRepository: SubscribeDetailRepository
): SubscribeDetailUseCase {
    override suspend fun getDetail(id: Int): Detail {
        return detailRepository.getDetail(id)
    }
}