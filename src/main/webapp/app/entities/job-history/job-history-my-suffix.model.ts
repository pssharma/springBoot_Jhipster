import { BaseEntity } from './../../shared';

const enum Language {
    'FRENCH',
    'ENGLISH',
    'SPANISH'
}

export class JobHistoryMySuffix implements BaseEntity {
    constructor(
        public id?: string,
        public startDate?: any,
        public endDate?: any,
        public language?: Language,
    ) {
    }
}
